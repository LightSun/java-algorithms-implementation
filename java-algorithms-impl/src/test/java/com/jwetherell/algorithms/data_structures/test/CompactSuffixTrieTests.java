package com.jwetherell.algorithms.data_structures.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jwetherell.algorithms.data_structures.CompactSuffixTrie;

public class CompactSuffixTrieTests {

    @Test
    public void testCompactSuffixTrie() {
        String bookkeeper = "bookkeeper";
        CompactSuffixTrie<String> trie = new CompactSuffixTrie<String>(bookkeeper);

        boolean exists = trie.doesSubStringExist(bookkeeper);
        assertTrue(exists, "YIKES!! " + bookkeeper + " doesn't exists.");

        String failed = "booker";
        exists = trie.doesSubStringExist(failed);
        assertFalse(exists, "YIKES!! " + failed + " exists.");

        String pass = "kkee";
        exists = trie.doesSubStringExist(pass);
        assertTrue(exists, "YIKES!! " + pass + " doesn't exists.");
    }

    @Test
    public void testCompactSuffixTrie_equals() {
        String bookkeeper = "bookkeeper";
        CompactSuffixTrie<String> trie = new CompactSuffixTrie<String>(bookkeeper);

        String bookkeeper_1 = "bookkeeper";
        CompactSuffixTrie<String> trie_1 = new CompactSuffixTrie<String>(bookkeeper_1);

        boolean equal = trie.equals(trie_1);
        assertTrue(equal, "YIKES!! " + bookkeeper + " and " + bookkeeper_1 + " are not equal.");


        String failed = "failed";
        trie = new CompactSuffixTrie<String>(failed);

        String failed_1 = "failet";
        trie_1 = new CompactSuffixTrie<String>(failed_1);

        equal = trie.equals(trie_1);
        assertFalse(equal, "YIKES!! " + failed + " and " + failed_1 + " are equal.");
    }
}
