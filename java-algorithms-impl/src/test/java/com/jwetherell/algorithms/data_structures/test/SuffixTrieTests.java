package com.jwetherell.algorithms.data_structures.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jwetherell.algorithms.data_structures.SuffixTrie;
import com.jwetherell.algorithms.data_structures.test.common.SuffixTreeTest;

public class SuffixTrieTests {

    @Test
    public void testSuffixTrie() {
        String bookkeeper = "bookkeeper";
        SuffixTrie<String> trie = new SuffixTrie<String>(bookkeeper);
        assertTrue(SuffixTreeTest.suffixTreeTest(trie, bookkeeper));
    }
}
