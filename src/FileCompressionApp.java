import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCompressionApp {
    public static void main(String[] args) throws IOException {
        HuffmanCoding huffman = new HuffmanCoding();

        // Load the input file
        String inputFilePath = "sample.txt";
        String text = new String(Files.readAllBytes(Paths.get(inputFilePath)));

        // Build Huffman Tree
        huffman.buildHuffmanTree(text);

        // Print Huffman Codes
        huffman.printCodes();

        // Encode the text
        String encodedText = huffman.encode(text);
        System.out.println("Encoded Text: " + encodedText);

        // Save the encoded text to a file
        String encodedFilePath = "compressed.txt";
        Files.write(Paths.get(encodedFilePath), encodedText.getBytes());
        System.out.println("Encoded text saved to: " + encodedFilePath);

        // Decode the text
        String decodedText = huffman.decode(encodedText);
        System.out.println("Decoded Text: " + decodedText);

        // Verify that the original and decoded texts are the same
        if (text.equals(decodedText)) {
            System.out.println("The original text and decoded text match!");
        } else {
            System.out.println("There is a mismatch between the original and decoded text.");
        }
    }
}
