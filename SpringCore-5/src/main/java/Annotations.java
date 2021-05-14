
public class Annotations {
	@Resource
	private Party person;
	@Resource(name="person")
	private Party party;
	@Inject
	private Party person;

}
