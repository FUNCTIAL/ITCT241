public class Test {

    public static void main(String[] args) {
        MyStack st = new MyStack(10);
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(2);
        System.out.println(st.pop());
        st.push(5);
        st.push(5);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
