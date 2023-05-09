package sukkiri14;

public class BankAccount {
//フィールド
	String accountNumber;
	int balance;
	
	
//メソッド
	@Override
	public String toString() {//toStringのオーバーライド
		return "「\\"+balance+"(口座番号"+accountNumber+")」";	//Sysetm.out.println(インスタンス変数)でこのメソッドが使われる
	}
	
	public boolean equals(String AN) {
		
		String str=AN.trim();//前後の空白を削除する
		
		if(str.equals("4649")) {//空白を削除したものと口座番号を比較	これは4649だけしか等価にならない
			return true;		//合っていればtrue
		}else {
			return false;		//違っていればfalse
		}
	}
	
	/*教科書での等価判定のメソッド
	 * 元々のequalsメソッドをオーバーライドする
	 * 
	 * public boolean equals(Object o{
	 * 	if(this==o){
	 * 	return true;
	 * }
	 * if(o instanceof Account);	//引数oがAccount変数とみなしていいならという条件
	 * 	Account a=(Account)o;	//変数にoをAccount変数として代入	
	 * 	String an1=this.accountNumber.trim();	//インスタンスにあるaccountNumberをtrimして空白を削除
	 * 	String an2=a.accountNumber.trim();		//上で作成した引数oを代入したaをtrimして空白を削除
	 * 	if(an1.equals(an2)){	//trimした2つの値が同じなら
	 * 		return true;	//戻り値でtrueを返す
	 * 	}
	 * }
	 * return false;	//合致しなければfalse
	 * }
	 */
	
}
