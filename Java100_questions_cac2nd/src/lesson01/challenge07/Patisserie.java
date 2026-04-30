/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double dnum1 = Double.parseDouble(str1);

		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		double dnum2 = Double.parseDouble(str2);

		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();
		double dnum3 = Double.parseDouble(str3);

		System.out.println("\nシトロン" + dnum1 + "個");
		System.out.println("ショコラ" + dnum2 + "個");
		System.out.println("ピスターシュ" + dnum3 + "個");

		System.out.println("\n合計個数" + (dnum1 + dnum2 + dnum3) + "個");

		double total = (250 * dnum1) + (280 * dnum2) + (320 * dnum3);
		System.out.println("合計金額" + (int) total + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン\t\t" + 250 + "\\・・・残り" + (int) (30 - dnum1) + "個");
		System.out.println("ショコラ\t\t" + 280 + "\\・・・残り" + (int) (30 - dnum2) + "個");
		System.out.println("ピスターシュ\t" + 320 + "\\・・・残り" + (int) (30 - dnum3) + "個");

	}
}
