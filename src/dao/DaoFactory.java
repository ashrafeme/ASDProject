package dao;

public class DaoFactory<T> {
	private static IRentalDao<?> dao = null;

	protected static synchronized void setDao(IRentalDao<?> d) {
		dao = d;
	}

	public static synchronized IRentalDao<?> getDao() {
		return dao == null ? dao = new RentalDaoImpl() : dao;
	}
}
