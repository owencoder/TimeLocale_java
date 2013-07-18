
	import java.util.Date;
	import java.text.DateFormat;
	
	public class TimeLocale
	{
		public static void main ( String[] args )
		{
			//	Unix起点時間から
			long utime = System.currentTimeMillis ();
			System.out.println ( "Unix Time = " + utime );
			
			//	US側の時間取得
			Format fmt = DateFormat.getDateTimeInstance ( DateFormat.LONG, DateFormat.FULL, Locale.US );
			System.out.println ( fmt.format( new Date () ) );
		}
	}