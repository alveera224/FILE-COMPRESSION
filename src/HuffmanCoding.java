import java.util.*;

public class HuffmanCoding {

    private Map<Character, String> huffmanCodes = new HashMap<>();
    private HuffmanNode root;

    // Build the Huffman Tree
    public void buildHuffmanTree(String text) {
        // Count character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Create a priority queue
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        // Build the Huffman Tree
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode newNode = new HuffmanNode('\0', left.getFrequency() + right.getFrequency());
            newNode.setLeft(left);
            newNode.setRight(right);

            pq.add(newNode);
        }

        root = pq.poll();

        // Generate Huffman Codes
        generateCodes(root, "");
    }

    // Generate Huffman Codes from the tree
    private void generateCodes(HuffmanNode node, String code) {
        if (node == null) return;

        if (node.getLeft() == null && node.getRight() == null) {
            huffmanCodes.put(node.getCharacter(), code);
        }

        generateCodes(node.getLeft(), code + "0");
        generateCodes(node.getRight(), code + "1");
    }

    // Encode the input text
    public String encode(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(huffmanCodes.get(c));
        }
        return encodedText.toString();
    }

    // Decode the encoded text
    public String decode(String encodedText) {
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode current = root;

        for (char bit : encodedText.toCharArray()) {
            current = (bit == '0') ? current.getLeft() : current.getRight();

            if (current.getLeft() == null && current.getRight() == null) {
                decodedText.append(current.getCharacter());
                current = root;
            }
        }

        return decodedText.toString();
    }

    // Print Huffman Codes
    public void printCodes() {
        System.out.println("Huffman Codes:");
        for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
