package lithium.federatedsearch.vo;

/**
 * Created by baban_sinha on 15/04/16.
 */
public class TagSets {
	private Tags[] tags;

	private String displayTagName;

	private String systemTagName;

	private String fieldName;

	public Tags[] getTags ()
	{
		return tags;
	}

	public void setTags (Tags[] tags)
	{
		this.tags = tags;
	}

	public String getDisplayTagName ()
	{
		return displayTagName;
	}

	public void setDisplayTagName (String displayTagName)
	{
		this.displayTagName = displayTagName;
	}

	public String getSystemTagName ()
	{
		return systemTagName;
	}

	public void setSystemTagName (String systemTagName)
	{
		this.systemTagName = systemTagName;
	}

	public String getFieldName ()
	{
		return fieldName;
	}

	public void setFieldName (String fieldName)
	{
		this.fieldName = fieldName;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [tags = "+tags+", displayTagName = "+displayTagName+", systemTagName = "+systemTagName+", fieldName = "+fieldName+"]";
	}

}
