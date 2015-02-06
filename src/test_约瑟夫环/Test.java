package test_Լɪ��;

import java.util.Scanner;

public class Test {
	private static class Node { 
        public int no;// ��� 
        public Node next;// ��һ���ڵ� 
 
        public Node(int no) { 
            this.no = no; 
        } 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("��������������"); 
        int totalNum = scanner.nextInt(); 
        System.out.print("�����뱨���Ĵ�С��"); 
        int cycleNum = scanner.nextInt(); 
        Node header = new Node(1); 
        Node pointer = header; 
        for (int i = 2; i <= totalNum; i++) { 
            pointer.next = new Node(i); 
            pointer = pointer.next; 
        } 
        pointer.next = header; 
        // ��ʼ������������� 
        System.out.println("�����ǳ��е�˳��:"); 
        while (pointer != pointer.next) { 
            for (int i = 1; i < cycleNum; i++) { 
                pointer = pointer.next; 
            } 
            System.out.println(pointer.next.no); 
            pointer.next = pointer.next.next; 
        } 
        System.out.println(pointer.next.no); 
    } 

}
