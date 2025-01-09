# File Compression Project using Huffman Coding

This project implements a **file compression and decompression system** using the **Huffman Coding** algorithm in Java.

---

## 🚀 Features

1. **Compress Text Files**: Encodes text files using Huffman Coding.
2. **Decompress Files**: Decodes the compressed files back to their original form.
3. **Display Huffman Codes**: Prints the Huffman Codes generated during compression.

---

## 🛠️ How to Run

### Prerequisites
1. **Java**: JDK 11 or higher installed.

### Steps
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/file-compression.git
   cd file-compression

# 📋 Example Input and Output
# Input (sample.txt):
this is a test file for compression using huffman coding

# Output:
Encoded Text: 10101001101... (compressed binary format)
Decoded Text: Matches the input.

# 📂 Project Structure
file-compression/
├── src/
│   ├── HuffmanNode.java       # Represents nodes in the Huffman Tree
│   ├── HuffmanCoding.java     # Implements Huffman Encoding and Decoding
│   ├── FileCompressionApp.java # Main application class
├── README.md                  # Documentation
├── LICENSE.md                 # License information
└── sample.txt                 # Sample input file



## **Huffman Coding**

### What is Huffman Coding?
**Huffman Coding** is a **greedy algorithm** used for **lossless data compression**. It assigns **variable-length binary codes** to characters based on their frequencies in the input data. Characters with higher frequencies are assigned shorter codes, while less frequent characters are assigned longer codes. This approach ensures that the most commonly used characters contribute less to the overall size of the compressed data.

Huffman Coding is one of the most efficient and commonly used methods for text compression and is used in popular formats like ZIP, GZIP, JPEG, and MP3.

---

### **How Huffman Coding Works**
1. **Calculate Character Frequencies**:
   - Count how often each character appears in the input data.
   
2. **Build a Priority Queue**:
   - Use a **min-heap** to store characters and their frequencies, ensuring that the smallest frequencies are processed first.

3. **Construct the Huffman Tree**:
   - Repeatedly combine the two nodes with the smallest frequencies to form a new parent node. This new node's frequency is the sum of its two child nodes.
   - Repeat until a single node (the root of the Huffman Tree) remains.

4. **Generate Huffman Codes**:
   - Traverse the Huffman Tree to assign binary codes to each character:
     - Assign `0` to the left branch.
     - Assign `1` to the right branch.
   - Each character gets a unique binary code, with shorter codes assigned to more frequent characters.

5. **Encode the Data**:
   - Replace each character in the input with its corresponding Huffman code.

6. **Decode the Data**:
   - Use the Huffman Tree to decode the compressed binary data back to the original form.

---

### **Why Use Huffman Coding?**

#### 1. **Efficient Compression**
- Huffman Coding minimizes the **total number of bits** required to represent the data. This is achieved by assigning shorter codes to frequent characters, reducing redundancy in the input data.

#### 2. **Lossless Compression**
- Unlike lossy compression methods, Huffman Coding does not lose any information. The original data can be perfectly reconstructed from the compressed data.

#### 3. **Optimal for Prefix Codes**
- Huffman Coding generates **prefix-free codes**, ensuring that no code is a prefix of another. This eliminates ambiguity during decoding.

#### 4. **Real-World Applications**
- Widely used in file compression tools (e.g., ZIP, GZIP) and multimedia codecs (e.g., JPEG, MP3) to reduce file size without losing quality.

#### 5. **Greedy Algorithm Advantage**
- Huffman Coding is a **greedy algorithm**. At every step, it makes the locally optimal choice (combining the two smallest frequencies) to ensure a globally optimal result (minimal compression size).

---

### **Example of Huffman Coding**

#### Input Text:
```
aaabbc
```

#### Step 1: Frequency of Characters
| Character | Frequency |
|-----------|-----------|
| `a`       | 3         |
| `b`       | 2         |
| `c`       | 1         |

#### Step 2: Build Huffman Tree
1. Combine `b` (2) and `c` (1) → New node with frequency `3`.
2. Combine `a` (3) and the new node (3) → Root node with frequency `6`.

#### Step 3: Generate Huffman Codes
| Character | Huffman Code |
|-----------|--------------|
| `a`       | `0`          |
| `b`       | `10`         |
| `c`       | `11`         |

#### Step 4: Encode the Input
Original Text: `aaabbc`  
Encoded Text: `000101011`

#### Step 5: Decode the Encoded Text
Encoded Text: `000101011`  
Decoded Text: `aaabbc`

---

### **Advantages of Huffman Coding**
1. **Space Efficiency**: Compresses data to significantly reduce storage space.
2. **Optimal Compression**: Produces the smallest possible compressed size for prefix-free codes.
3. **Versatility**: Works well for both text and binary data.
4. **Easy Decoding**: Uses the Huffman Tree for efficient decoding.

---

### **Why Are We Using Huffman Coding in This Project?**
1. **Efficient Data Compression**:
   - Huffman Coding ensures optimal compression for text or binary data, minimizing the storage requirements.

2. **Learning Data Structures and Algorithms**:
   - This project demonstrates the practical use of **priority queues (min-heaps)**, **binary trees**, and the **greedy algorithm strategy**.

3. **Real-World Applications**:
   - Huffman Coding is widely used in real-world file compression formats like ZIP and GZIP. Implementing it helps understand how these systems work under the hood.

4. **Lossless Compression**:
   - Huffman Coding guarantees that no data is lost during compression, making it suitable for scenarios where accuracy is critical.

---

You can include this explanation in your **README.md** to give your project more depth and clarity. Let me know if you’d like assistance in writing the complete README.md or further explanations! 😊
