#include <iostream>

using namespace std;
import java.util.*;

class queandStack {
    //Write your code here
    Stack stack = new Stack();
    Queue queue = new Queue() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public T[] toArray(Object[] a) {
            return new T[0];
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean addAll(Collection c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }

        @Override
        public boolean offer(Object o) {
            return false;
        }

        @Override
        public Object remove() {
            return null;
        }

        @Override
        public Object poll() {
            return null;
        }

        @Override
        public Object element() {
            return null;
        }

        @Override
        public Object peek() {
            return null;
        }
    };

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public char popCharacter(){
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.remove();
    }
}

    int main() {
        // read the string s.
        string s;
        getline(cin, s);

        // create the Solution class object p.
        Solution obj;

        // push/enqueue all the characters of string s to stack.
        for (int i = 0; i < s.length(); i++) {
            obj.pushCharacter(s[i]);
            obj.enqueueCharacter(s[i]);
        }

        bool isPalindrome = true;

        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length() / 2; i++) {
            if (obj.popCharacter() != obj.dequeueCharacter()) {
                isPalindrome = false;

                break;
            }
        }

        // finally print whether string s is palindrome or not.
        if (isPalindrome) {
            cout << "The word, " << s << ", is a palindrome.";
        } else {
            cout << "The word, " << s << ", is not a palindrome.";
        }

        return 0;
    }