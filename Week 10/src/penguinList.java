public class penguinList {
    class IntNode {
        public int id;
        public int weight;
        public int height;
        public IntNode next;

        private IntNode (int i, int w, int h, IntNode n) {
            id = i;
            weight = w;
            height = h;
            next = n;
        }
    }

    private IntNode first;
    private int listSize;

    public penguinList(int i, int w, int h) {
        first = new IntNode(i, w, h, null);
        listSize++;
    }

    public void addFirst(int i, int w, int h) {
        first = new IntNode(i, w, h, first);
        listSize++;
    }

    public int getFirstId() {
        return first.id;
    }

    public int getFirstHeight() {
        return first.height;
    }

    public int getFirstWeight() {
        return first.weight;
    }

    public int getListSize() {
        return listSize;
    }
}
