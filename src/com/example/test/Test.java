package com.example.test;

import java.io.*;

public class Test {

	// eラーニングのサンプル問題解答用クラス
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			while (true) {
				System.out.println("西暦を入力してください(0を入力したら終了します。)");
				int year = Integer.parseInt(reader.readLine());
				if (year == 0) {
					System.out.println("処理を終了します。");
					break;
					// 4で割れて、100で割れる。もしくは400で割れる　→　うるう年！
				} else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					System.out.println(year + "年はうるう年です。");
					// その他 → うるう年ではない！
				} else {
					System.out.println(year + "年はうるう年ではありません。");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してください。");
		}

	}

	/**
	 * Java5サンプル問題
	 */
	public class Qu31 {
		public int main(int num, int sum) {
			num = 10;
			sum = 20;
			return (sum);
		}
	}

}