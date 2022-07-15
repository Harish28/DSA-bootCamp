package DSA.Trie;
class Node {
    private Node[] child = new Node[26];
    private boolean isWord = false;
    private int wordCount = 0;
    private int prefixWordCount = 0;
    Node() {}

    public Node[] getChild() {
        return child;
    }

    public void setChild(Node[] child) {
        this.child = child;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public int getPrefixWordCount() {
        return prefixWordCount;
    }

    public void setPrefixWordCount(int prefixWordCount) {
        this.prefixWordCount = prefixWordCount;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }
}
class Tries {
    Node root = new Node();
    public void insert(String word) {
        Node curNode = root;
        for(char c : word.toCharArray()) {
            Node[] child = curNode.getChild();
            if(child[c - 'a'] == null) {
                child[c - 'a'] = new Node();
            }
            curNode.setPrefixWordCount(curNode.getPrefixWordCount() + 1);
            curNode = child[c - 'a'];
        }
        curNode.setWord(true);
        curNode.setWordCount(curNode.getWordCount() + 1);
    }
    public Node searchWord(String word) {
        Node curNode = root;
        for(char c : word.toCharArray()) {
            Node[] child = curNode.getChild();
            if(child[c - 'a'] == null) {
                return null;
            }
            curNode = child[c - 'a'];
        }
        return curNode;
    }

    public Node startsWith(String word) {
        Node curNode = root;
        for(char c : word.toCharArray()) {
            Node[] child = curNode.getChild();
            if(child[c - 'a'] == null) {
                return null;
            }
            curNode = child[c - 'a'];
        }
        return curNode;
    }

    public int countWord(String word) {
        Node node = this.searchWord(word);
        return node == null ? 0 : node.getWordCount();
    }

    public int countWordStartWith(String word) {
        Node node = this.startsWith(word);
        return node == null ? 0 : node.getWordCount() + node.getPrefixWordCount();
    }
}
public class TriesImpl {
    public static void main(String[] args) {
        Tries tries = new Tries();
        tries.insert("apple");
        tries.insert("apple");
        tries.insert("apple");
        tries.insert("apps");
        tries.insert("apxl");
        tries.insert("afssd");
        tries.insert("artt");
        tries.insert("bat");
        tries.insert("base");
        tries.insert("base");
        tries.insert("best");

        System.out.println(tries.countWord("apple"));
        System.out.println(tries.countWord("apps"));
        System.out.println(tries.countWord("base"));
        System.out.println(tries.countWord("baseafdas"));

        System.out.println(tries.countWordStartWith("a"));
        System.out.println(tries.countWordStartWith("appl"));
        System.out.println(tries.countWordStartWith("base"));
    }
}

