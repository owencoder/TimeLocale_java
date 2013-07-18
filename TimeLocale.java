
	import java.util.Date;
	import java.text.DateFormat;
	
	public class TimeLocale
	{
		public static void main ( String[] args )
		{
			//	Unix‹N“_ŽžŠÔ‚©‚ç
			long utime = System.currentTimeMillis ();
			System.out.println ( "Unix Time = " + utime );
			
			//	US‘¤‚ÌŽžŠÔŽæ“¾
			Format fmt = DateFormat.getDateTimeInstance ( DateFormat.LONG, DateFormat.FULL, Locale.US );
			System.out.println ( fmt.format( new Date () ) );
		}
	}