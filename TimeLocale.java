
	import java.util.Date;
	import java.text.DateFormat;
	
	public class TimeLocale
	{
		public static void main ( String[] args )
		{
			//	Unix起点時間から
			long utime = System.currentTimeMillis ();
			System.out.println ( "Unix Time = " + utime );
			
			//	US側の時間取得。Format型の変数に、DateFormat.getDateTimeInstanceを利用して代入する
			//	コレを利用すると、ロケールがUS、書式もUS形式で表示される
			Format fmt = DateFormat.getDateTimeInstance ( DateFormat.LONG, DateFormat.FULL, Locale.US );
			//	今の時刻取得
			Date now = new Date ();
			
			System.out.println ( fmt.format( now ) );
		}
	}