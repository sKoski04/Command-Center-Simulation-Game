import java.util.List;

public interface GeneralizedCrud <T> {
	void create(T obj);
	void update (T obj);
	void delete (T obj);
	List <T> getAll();

}
