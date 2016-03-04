package implementation.non_linear;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hkhoi
 */
public class Trie {

    private final TrieNode root = new TrieNode();

    public void add(String word) {
        TrieNode iterator = root;
        for (int i = 0; i < word.length(); ++i) {
            int index = word.charAt(i) - 'a';
            if (iterator.children[index] == null) {
                iterator.children[index] = new TrieNode();
            }
            iterator = iterator.children[index];
            if (i == word.length() - 1) {
                iterator.isCompleted = true;
            }
        }
    }

    public boolean contains(String word) {
        TrieNode iterator = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (iterator.children[index] == null) {
                return false;
            }
            iterator = iterator.children[index];
        }
        return iterator.isCompleted;
    }

    public List<String> getSuggestions(String word) {
        TrieNode iterator = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (iterator != null) {
                iterator = iterator.children[index];
            } else {
                break;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        if (iterator != null) {
            iterator.getSuggestion(word, word, list);
        }

        return list;
    }

    private class TrieNode {

        private boolean isCompleted = false;
        private final TrieNode[] children = new TrieNode[26];

        private void getSuggestion(String word, String str, ArrayList<String> list) {
            if (isCompleted) {
                list.add(str);
            }
            for (int i = 0; i < 26; ++i) {
                if (children[i] != null) {
                    children[i].getSuggestion(word, str + ((char) (i + 'a')), list);
                }
            }
        }
    }
}
