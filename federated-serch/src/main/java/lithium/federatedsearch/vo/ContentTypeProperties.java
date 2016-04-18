package lithium.federatedsearch.vo;

/**
 * Created by baban_sinha on 15/04/16.
 */
public class ContentTypeProperties {
	private String answercard;

	private String sectiontitle;

	private String firststepstitle;

	private String shortdesc;

	private String firststepscontent;

	public String getAnswercard ()
	{
		return answercard;
	}

	public void setAnswercard (String answercard)
	{
		this.answercard = answercard;
	}

	public String getSectiontitle ()
	{
		return sectiontitle;
	}

	public void setSectiontitle (String sectiontitle)
	{
		this.sectiontitle = sectiontitle;
	}

	public String getFirststepstitle ()
	{
		return firststepstitle;
	}

	public void setFirststepstitle (String firststepstitle)
	{
		this.firststepstitle = firststepstitle;
	}

	public String getShortdesc ()
	{
		return shortdesc;
	}

	public void setShortdesc (String shortdesc)
	{
		this.shortdesc = shortdesc;
	}

	public String getFirststepscontent ()
	{
		return firststepscontent;
	}

	public void setFirststepscontent (String firststepscontent)
	{
		this.firststepscontent = firststepscontent;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [answercard = "+answercard+", sectiontitle = "+sectiontitle+", firststepstitle = "+firststepstitle+", shortdesc = "+shortdesc+", firststepscontent = "+firststepscontent+"]";
	}
}
