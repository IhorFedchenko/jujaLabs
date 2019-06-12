package lab38;

public class AccountManager {
    public static boolean transfer(Account[] accounts, int[] delta) {
        int index = 0;
        while (index < accounts.length) {
            try {
                accounts[index].change(delta[index]);
            } catch (TryAgainException e) {
                continue;
            } catch (BlockAccountException e) {
                try {
                    for (int index2 = 0; index2 < index; index2++) {
                        accounts[index2].change(-delta[index2]);
                    }
                } catch (TryAgainException e1) {

                } catch (BlockAccountException e1) {

                }
                return false;
            }
            index++;
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
