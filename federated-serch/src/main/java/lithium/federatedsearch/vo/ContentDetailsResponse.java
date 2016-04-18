package lithium.federatedsearch.vo;

/**
 * Created by baban_sinha on 15/04/16.
 */
public class ContentDetailsResponse {
	private String message;

	private ResultBody resultBody;

	private String status;

	private String resultType;

	public String getMessage ()
	{
		return message;
	}

	public void setMessage (String message)
	{
		this.message = message;
	}

	public ResultBody getResultBody ()
	{
		return resultBody;
	}

	public void setResultBody (ResultBody resultBody)
	{
		this.resultBody = resultBody;
	}

	public String getStatus ()
	{
		return status;
	}

	public void setStatus (String status)
	{
		this.status = status;
	}

	public String getResultType ()
	{
		return resultType;
	}

	public void setResultType (String resultType)
	{
		this.resultType = resultType;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [message = "+message+", resultBody = "+resultBody+", status = "+status+", resultType = "+resultType+"]";
	}

}
