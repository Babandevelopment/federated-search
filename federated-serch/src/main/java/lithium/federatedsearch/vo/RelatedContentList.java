package lithium.federatedsearch.vo;

/**
 * Created by baban_sinha on 15/04/16.
 */
public class RelatedContentList {
	private String value;

	public String getValue ()
	{
		return value;
	}

	public void setValue (String value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [value = "+value+"]";
	}

}
