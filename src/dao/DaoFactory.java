package dao;

public class DaoFactory<T> {
	private static IRepositoryDao<?> dao = null;

	protected static synchronized void setDao(IRepositoryDao<?> d) {
		dao = d;
	}

	public static synchronized IRepositoryDao<?> getDao() {
		return dao == null ? dao = new RepositoryDaoImpl() : dao;
	}
}
