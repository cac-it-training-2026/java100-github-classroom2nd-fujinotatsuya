/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("\n合計個数" + (num1 + num2 + num3) + "個");
		System.out.println("合計金額" + (250 * num1 + 280 * num2 + 320 * num3) + "円");
		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン\t\t" + 250 + "\\・・・残り" + (30 - num1) + "個");
		System.out.println("ショコラ\t\t" + 280 + "\\・・・残り" + (30 - num2) + "個");
		System.out.println("ピスターシュ\t" + 320 + "\\・・・残り" + (30 - num3) + "個");

	}
}
