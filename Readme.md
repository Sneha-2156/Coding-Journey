# 🚀 Coding Journey

A day-by-day log of my **Java + DSA practice**, built one problem at a time. Each file is a single, focused problem with the logic explained in comments and the time/space complexity noted.

> Goal: become job-ready and interview-confident in full-stack Java by building a strong DSA foundation.

---

## 📂 Structure

```
Coding-Journey/
├── day1/   # Basics: math, arrays, strings, searching  (p1 – p20)
├── day2/   # Hashing, two pointers, sorting, recursion (p21 – p29)
└── day3/   # Recursion vs iteration, binary search variants, math tricks (p30 – p35)
```

Each file is named `p<number>.java`. In Day 2, a `b` suffix (e.g. `p26b`) means a **second, better approach** to the same problem. From Day 3 onward, each approach gets its own file number.

---

## 📅 Progress

### Day 1 — Fundamentals

| File | Problem | Time | Space |
|------|---------|------|-------|
| p1 | Check even or odd | O(1) | O(1) |
| p2 | Positive, negative or zero | O(1) | O(1) |
| p3 | Largest of two numbers | O(1) | O(1) |
| p4 | Sum of first n natural numbers | O(n) | O(1) |
| p5 | Factorial of a number | O(n) | O(1) |
| p6 | Reverse a number | O(d) | O(1) |
| p7 | Count digits | O(d) | O(1) |
| p8 | Check prime number | O(√n) | O(1) |
| p9 | First n Fibonacci numbers | O(n) | O(1) |
| p10 | Largest element in an array | O(n) | O(1) |
| p11 | Palindrome number | O(d) | O(1) |
| p12 | GCD (Euclidean algorithm) | O(log min(a,b)) | O(1) |
| p13 | Smallest element in an array | O(n) | O(1) |
| p14 | Sum of array elements | O(n) | O(1) |
| p15 | Second-largest distinct element | O(n) | O(1) |
| p16 | Reverse an array (two pointers) | O(n) | O(1) |
| p17 | Linear search | O(n) | O(1) |
| p18 | Reverse a string | O(n) | O(n) |
| p19 | Palindrome string (two pointers) | O(n) | O(1) |
| p20 | Binary search | O(log n) | O(1) |

*d = number of digits*

### Day 2 — Hashing, Sorting & Recursion

| File | Problem | Approach | Time | Space |
|------|---------|----------|------|-------|
| p21 | Frequency of each element | HashMap | O(n) | O(n) |
| p22 | Find duplicate elements | HashSet | O(n) | O(n) |
| p23 | Move all zeros to the end | Index pointer | O(n) | O(1) |
| p24 | Remove duplicates from sorted array | Two pointers | O(n) | O(1) |
| p25 | Find the missing number | Sum formula n(n+1)/2 | O(n) | O(1) |
| p26 | Two Sum | Brute force | O(n²) | O(1) |
| p26b | Two Sum | HashMap (optimized) | O(n) | O(n) |
| p27 | Bubble sort | Nested loops | O(n²) | O(1) |
| p27b | Bubble sort | With early-exit `swapped` flag | O(n²) / best O(n) | O(1) |
| p28 | Selection sort | Min-index swap | O(n²) | O(1) |
| p29 | Factorial | Recursion | O(n) | O(n) |

### Day 3 — Recursion, Binary Search & Math Tricks

| File | Problem | LC | Approach | Time | Space |
|------|---------|----|----------|------|-------|
| p30 | Fibonacci number | 509 | Recursion (brute force) | O(2ⁿ) | O(n) |
| p31 | Fibonacci number | 509 | Iteration (two variables) | O(n) | O(1) |
| p32 | First & last position of element | 34 | Binary search (keep going left/right) | O(log n) | O(1) |
| p33 | Repeat & missing number | 645 | Brute force counting | O(n²) | O(1) |
| p34 | Repeat & missing number | 645 | Frequency array | O(n) | O(n) |
| p35 | Repeat & missing number | 645 | Sum + sum of squares (optimal) | O(n) | O(1) |

---

## 🧠 Concepts Covered

- **Basics:** conditionals, loops, `Scanner` input
- **Number logic:** digit extraction, reverse, palindrome, GCD, primes, Fibonacci
- **Arrays:** min/max, sum, reverse, second largest
- **Strings:** reverse, palindrome check
- **Searching:** linear search, binary search
- **Hashing:** `HashMap`, `HashSet`, `getOrDefault`
- **Techniques:** two pointers, brute force → optimized approach
- **Sorting:** bubble sort, selection sort
- **Recursion:** base case + recursive case
- **Recursion vs iteration:** why plain recursive Fibonacci blows up
- **Binary search variants:** first and last occurrence
- **Frequency array:** counting without a HashMap
- **Math tricks:** sum and sum of squares to find two unknowns

---

## ▶️ How to Run

**Requirements:** JDK 25 or later (the files use the simplified instance `void main()` entry point).

```bash
# Clone the repository
git clone https://github.com/Sneha-2156/Coding-Journey.git
cd Coding-Journey

# Compile a file
javac day1/p1.java

# Run it (use the package name)
java day1.p1
```

Or just open the folder in IntelliJ IDEA / VS Code and run any file directly.

---

## 🗺️ Roadmap

- [x] Day 1 — Basics, arrays, strings, searching
- [x] Day 2 — Hashing, sorting, recursion
- [x] Day 3 — Recursion, binary search variants, math tricks
- [ ] Day 4 — Coming soon
- [ ] Later — Linked lists, stacks & queues, trees, dynamic programming

---

## 👩‍💻 Author

**Sneha**
B.E. Computer Science & Engineering, Sir M. Visvesvaraya Institute of Technology, Bengaluru

[GitHub](https://github.com/Sneha-2156) · [LinkedIn](https://www.linkedin.com/in/sneha-m-b-09a70038a)

---

⭐ If this helps your own practice, feel free to star the repo!