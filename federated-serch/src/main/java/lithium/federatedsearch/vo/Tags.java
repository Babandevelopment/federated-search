package lithium.federatedsearch.vo;

/**
 * Created by baban_sinha on 15/04/16.
 */
public class Tags {
	private String displayTagName;

	private String systemTagName;

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

	@Override
	public String toString()
	{
		return "ClassPojo [displayTagName = "+displayTagName+", systemTagName = "+systemTagName+"]";
	}

}
