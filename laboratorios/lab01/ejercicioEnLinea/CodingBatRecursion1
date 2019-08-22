//count8
public int count8(int n) {
  if (n == 0) return 0;
    if (n >= 88 && n % 100 == 88) return 2 + count8(n / 10);
    if (n % 10 == 8) return 1 + count8(n / 10);
    return count8(n / 10);
}

//power n
public int powerN(int base, int n) {
 if (n == 0) return 1;
    return base * powerN(base, n - 1);
}

// fibonacci
public int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 2) + fibonacci(n - 1);
}

//countX
public int countX(String str) {
  if (str.length() == 0) return 0;
    if (str.charAt(0) == 'x') return 1 + countX(str.substring(1));
    return countX(str.substring(1));
}

//sumDigits
public int sumDigits(int n) {
  if (n == 0) return 0;
    return n % 10 + sumDigits(n / 10);
}
