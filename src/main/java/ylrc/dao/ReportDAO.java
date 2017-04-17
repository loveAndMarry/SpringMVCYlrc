package ylrc.dao;

public interface ReportDAO{

	boolean ReportUser(String UserId,String reportedfromuserId);

	boolean ReportDN(String DNId,String reportedfromuserId);
	/**
	 * number of the user's reported
	 */
	int ReportUserNumber(String ReportUserId);
	/**
	 * number of the DN's reported
	 */
	int ReportDNNumber(String ReportDNboId);
}