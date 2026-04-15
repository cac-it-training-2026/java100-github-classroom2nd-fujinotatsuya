/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。\n");

		System.out.println("売上の割合\n売上合計\t\t" + (int) total + "円");

		System.out.println("\n内訳");
		System.out.println("シトロン     \\" + (int) (250 * dnum1) + "・・・" + (int) ((250 * dnum1) / total * 100) + "%");

		System.out.println("ショコラ     \\" + (int) (280 * dnum2) + "・・・" + (int) ((250 * dnum2) / total * 100) + "%");

		System.out.println("ピスターシュ \\" + (int) (320 * dnum3) + "・・・" + (int) ((250 * dnum3) / total * 100) + "%");
	}
}
