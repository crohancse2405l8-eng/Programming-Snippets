const text = "madam";
const reversed = text.split("").reverse().join("");

if (text.toLowerCase() === reversed.toLowerCase()) {
    console.log("Palindrome");
} else {
    console.log("Not a palindrome");
}