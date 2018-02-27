package Task9;

public class ListCharExtended extends ListChar {

    @Override
    public boolean add(char e) {
        if (this.listContains(e)) {
            System.out.println(("Failed to add char: " + e) +"\nReason: list already contains char");
            return false;
        }
        return super.add(e);
    }

    @Override
    public boolean set(int index, char c) {

        if (this.listContains(c)) {
            return false;
        }
        return super.set(index, c);
    }

    @Override
    public boolean addAll(ListChar listChar1) {
        for (int i = 0; i < listChar1.getFullSize(); i++) {
            for (int j = 0; j < this.getFullSize(); j++) {
                if (this.get(j) == listChar1.get(i)){
                    return false;
                }
            }
        }
        return super.addAll(listChar1);
    }

    public boolean listContains(char a) {
        for (int i = 0; i < this.getFullSize(); i++) {
            if (this.get(i) == a) {
                return true;
            }
        }
        return false;
    }
}
