package com.leetcode.problems;

import java.math.BigInteger;

import com.leetcode.model.Problema;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class P2 extends Problema {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		String n1 = getStringNumbers(l1);
		String n2 = getStringNumbers(l2);
		String suma = null;
		
		if(n1.length()>10000000 || n2.length()>10000000) {
			BigInteger bn1 = new BigInteger(n1);
			BigInteger bn2 = new BigInteger(n2);
			suma = String.valueOf(bn1.add(bn2));
		}
		else {
			suma = String.valueOf(Long.parseLong(n1) + Long.parseLong(n2));
		}
		
		return convertNumberToListNode(suma);
	}
	
	public ListNode convertNumberToListNode(String text) {
		String[] sumaArreglo = text.split("");
		ListNode listResp = null;
		for (int i = 0; i < sumaArreglo.length; i++) {
			int numeroValor = Integer.parseInt(sumaArreglo[i]);
			if (i == 0)
				listResp = new ListNode(numeroValor);
			else
				listResp = new ListNode(numeroValor, listResp);
		}
		
		return listResp;
	}

	public String getStringNumbers(ListNode l) {
		String resp = "";
		resp += l.val;
		while (l.next != null) {
			l = l.next;
			resp = l.val + resp;
		}
		return resp;
	}

	@Override
	public void runTest() {		
		String numero1 = "243";
		String numero2 = "564";
		ListNode l1 = convertNumberToListNode(numero1);
		ListNode l2 = convertNumberToListNode(numero2);
		
		ListNode resp = addTwoNumbers(l1, l2);

		System.out.println(getStringNumbers(l1));
		System.out.println(getStringNumbers(l2));
		System.out.println(getStringNumbers(resp));

	}

}
