package com.leetcode.problems;

import com.leetcode.model.Problema;

public class P5 extends Problema {

	public String longestPalindrome(String s) {
		if (esPalindromo(s))
			return s;

		String resp = "";
		int nMayor = 0;
		int asignado = 0;

		for (int i = 0; i < s.length(); i++) {
			char primeraLetra = s.charAt(i);
			for (int j = i; j <= s.length(); j++) {
				if (j - i > nMayor) {
					if (primeraLetra == s.charAt(j - 1)) {
						char segundaLetra = s.charAt(i + 1);
						if (j - i < 6 || segundaLetra == s.charAt(j - 2)) {
							char terceraLetra = s.charAt(i + 2);
							if (j - i < 6 || terceraLetra == s.charAt(j - 3)) {
								String extractoCadena = s.substring(i, j);
								asignado++;
								if (esPalindromo(extractoCadena)) {
									nMayor = extractoCadena.length();
									resp = extractoCadena;
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Asignado: " + asignado);
		return resp;
	}

	int if1, if2, if3, fMain = 0;

	public boolean esPalindromo(String s) {
		int sSize = s.length();
		int maxLength = 20;
		if (sSize > maxLength) {
			if (!(s.charAt(0) == s.charAt(sSize - 1))) {
				if1++;
				return false;

			}
			if (!(s.charAt(1) == s.charAt(sSize - 2))) {
				if2++;
				return false;
			}
			if (!s.substring(2, 3).equals(s.substring(sSize - 3, sSize - 2))) {
				if3++;
				return false;
			}
		}
		fMain++;
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	@Override
	public void runTest() {
		long startTime = System.nanoTime();

		String s = "busislnescsicxpvvysuqgcudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwudefrfjbwwjcchtgqyajdfwvkypfwshnihjdztgmyuuljxgvhdiwphrweyfkbnjgerkmifbirubhseuhrugwrabnjafnbdfjnufdstjbkuwtnpflffaqmjbhssjlnqftgjiglvvequhapasarlkcvbmkwnkuvwktbgfoaxteprobdwswcdyddyvrehvmxrrjiiidatidlpihkbmmruysmhhsncmfdanafdrfpdtfgkglcqpwrrtvacuicohspkounojuziittugpqjyhhkwfnflozbispehrtrnizowrlzcuollagxwtznjwzcumvedjwokueuqktvvouwnsmpxqvvpuwprezrbobrpnwaccwljchdguubjulyilzvmandjjleitweybqkjttschrjjlebnmponvlktzzcdtuybugggcqffkcffpamauvxfbonjrobgpvlyzveiwemmtdvbjciaytvesnocnjrwodtcokgcuoiicxapmrzpkfphjniuvzjrhbnqndfshoduejyktebgdabidxlkstepuwvtrtgbxaeheylicvhrxddijshcvdadxzsccmainyfpfdhqdanfccqkzlmhsfilvoybqojlvbcixjzqpbngdvesuokbxhkomsiqfyukvspqthlzxdnlwthrgaxhtpjzhrugqbfokrdcyurivmzgtynoqfjbafboselxnfupnpqlryvlcxeksirvufepfwczosrrjpudbwqxwldgjyfjhzlzcojxyqjyxxiqvfhjdwtgoqbyeocffnyxhyyiqspnvrpxmrtcnviukrjvpavervvztoxajriuvxqveqsrttjqepvvahywuzwtmgyrzduxfqspeipimyoxmkadrvrdyefekjxcmsmzmtbugyckcbjsrymszftjyllfmoeoylzeahnrxlxpnlvlvzltwnmldi";

		System.out.println(s.length());
		System.out.println(longestPalindrome(s));

		long endTime = System.nanoTime();
		double duration = (endTime - startTime) / 1000000; // divide by 1000000 to get milliseconds.
		System.out.println("Duracion: " + duration);
		System.out.println("IF1: " + if1 + ", IF2: " + if2 + ", IF3:" + if3 + ", Main: " + fMain);

	}

}
