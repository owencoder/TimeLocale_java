
	import java.util.Date;
	import java.text.DateFormat;
	
	public class TimeLocale
	{
		public static void main ( String[] args )
		{
			//	Unix�N�_���Ԃ���
			long utime = System.currentTimeMillis ();
			System.out.println ( "Unix Time = " + utime );
			
			//	US���̎��Ԏ擾�BFormat�^�̕ϐ��ɁADateFormat.getDateTimeInstance�𗘗p���đ������
			//	�R���𗘗p����ƁA���P�[����US�A������US�`���ŕ\�������
			Format fmt = DateFormat.getDateTimeInstance ( DateFormat.LONG, DateFormat.FULL, Locale.US );
			//	���̎����擾
			Date now = new Date ();
			
			System.out.println ( fmt.format( now ) );
		}
	}