package lab38;

public class AccountManager {
    public static boolean transfer(Account[] accounts, int[] delta) {
        int deltaIndex = delta.length;
        for (Account account: accounts) {
            try {
                account.change(delta[deltaIndex]);
            } catch (TryAgainException e) {
                continue;
            } catch (BlockAccountException e) {
                try {
                    account.change(- delta[deltaIndex]);
                } catch (TryAgainException e1) {
                   return false;
                } catch (BlockAccountException e1) {
                   return false;
                }

            }
        }
        return true;
    }
}

abstract class Account {
    protected int amount;

    public Account(int amount) {
        this.amount = amount;
    }

    public abstract void change(int delta) throws TryAgainException, BlockAccountException;

    public int getAmount() {
        return amount;
    }
}


class TryAgainException extends Exception {
}

class BlockAccountException extends Exception {
}
