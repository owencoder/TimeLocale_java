
	import java.util.Date;
	import java.text.DateFormat;
	
	public class TimeLocale
	{
		public static void main ( String[] args )
		{
			//	Unix�N�_���Ԃ���
			long utime = System.currentTimeMillis ();
			System.out.println ( "Unix Time = " + utime );
			
			//	US���̎��Ԏ擾
			Format fmt = DateFormat.getDateTimeInstance ( DateFormat.LONG, DateFormat.FULL, Locale.US );
			System.out.println ( fmt.format( new Date () ) );
		}
	}