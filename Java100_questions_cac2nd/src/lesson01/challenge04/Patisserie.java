/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("\n本日のおすすめの商品です。\n");
		int sito = 30;
		int syoko = 30;
		int pista = 30;

		System.out.println("シトロン      \\250・・・残り" + sito + "個");
		System.out.println("ショコラ      \\280・・・残り" + syoko + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pista + "個");

		System.out.println("\nそれぞれ何個づつ買いますか。（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String str1 = reader.readLine();
		int num1 = Integer.parseInt(str1);

		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		int num2 = Integer.parseInt(str2);

		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();
		int num3 = Integer.parseInt(str3);

		System.out.println("\nシトロン" + str1 + "個");
		System.out.println("ショコラ" + str2 + "個");
		System.out.println("ピスターシュ" + str3 + "個");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
	}
}
