package lithium.federatedsearch.vo;

/**
 * Created by baban_sinha on 15/04/16.
 */
public class ResultBody {
	private String status;

	private String seoDesc;

	private ContentTypeProperties contentTypeProperties;

	private String contentType;

	private String publishedId;

	private String version;

	private String id;

	private String seoTitle;

	private String excludeInternalSearch;

	private String title;

	private RelatedContentList[] relatedContentList;

	private String excludeSpanish;

	private String lastModifiedDate;

	private String publishedDate;

	private TagSets[] tagSets;

	private String viewCount;

	private String seoNoIndex;

	private String seoKey;

	public String getStatus ()
	{
		return status;
	}

	public void setStatus (String status)
	{
		this.status = status;
	}

	public String getSeoDesc ()
	{
		return seoDesc;
	}

	public void setSeoDesc (String seoDesc)
	{
		this.seoDesc = seoDesc;
	}

	public ContentTypeProperties getContentTypeProperties ()
	{
		return contentTypeProperties;
	}

	public void setContentTypeProperties (ContentTypeProperties contentTypeProperties)
	{
		this.contentTypeProperties = contentTypeProperties;
	}

	public String getContentType ()
	{
		return contentType;
	}

	public void setContentType (String contentType)
	{
		this.contentType = contentType;
	}

	public String getPublishedId ()
	{
		return publishedId;
	}

	public void setPublishedId (String publishedId)
	{
		this.publishedId = publishedId;
	}

	public String getVersion ()
	{
		return version;
	}

	public void setVersion (String version)
	{
		this.version = version;
	}

	public String getId ()
	{
		return id;
	}

	public void setId (String id)
	{
		this.id = id;
	}

	public String getSeoTitle ()
	{
		return seoTitle;
	}

	public void setSeoTitle (String seoTitle)
	{
		this.seoTitle = seoTitle;
	}

	public String getExcludeInternalSearch ()
	{
		return excludeInternalSearch;
	}

	public void setExcludeInternalSearch (String excludeInternalSearch)
	{
		this.excludeInternalSearch = excludeInternalSearch;
	}

	public String getTitle ()
	{
		return title;
	}

	public void setTitle (String title)
	{
		this.title = title;
	}

	public RelatedContentList[] getRelatedContentList ()
	{
		return relatedContentList;
	}

	public void setRelatedContentList (RelatedContentList[] relatedContentList)
	{
		this.relatedContentList = relatedContentList;
	}

	public String getExcludeSpanish ()
	{
		return excludeSpanish;
	}

	public void setExcludeSpanish (String excludeSpanish)
	{
		this.excludeSpanish = excludeSpanish;
	}

	public String getLastModifiedDate ()
	{
		return lastModifiedDate;
	}

	public void setLastModifiedDate (String lastModifiedDate)
	{
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getPublishedDate ()
	{
		return publishedDate;
	}

	public void setPublishedDate (String publishedDate)
	{
		this.publishedDate = publishedDate;
	}

	public TagSets[] getTagSets ()
	{
		return tagSets;
	}

	public void setTagSets (TagSets[] tagSets)
	{
		this.tagSets = tagSets;
	}

	public String getViewCount ()
	{
		return viewCount;
	}

	public void setViewCount (String viewCount)
	{
		this.viewCount = viewCount;
	}

	public String getSeoNoIndex ()
	{
		return seoNoIndex;
	}

	public void setSeoNoIndex (String seoNoIndex)
	{
		this.seoNoIndex = seoNoIndex;
	}

	public String getSeoKey ()
	{
		return seoKey;
	}

	public void setSeoKey (String seoKey)
	{
		this.seoKey = seoKey;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [status = "+status+", seoDesc = "+seoDesc+", contentTypeProperties = "+contentTypeProperties+", contentType = "+contentType+", publishedId = "+publishedId+", version = "+version+", id = "+id+", seoTitle = "+seoTitle+", excludeInternalSearch = "+excludeInternalSearch+", title = "+title+", relatedContentList = "+relatedContentList+", excludeSpanish = "+excludeSpanish+", lastModifiedDate = "+lastModifiedDate+", publishedDate = "+publishedDate+", tagSets = "+tagSets+", viewCount = "+viewCount+", seoNoIndex = "+seoNoIndex+", seoKey = "+seoKey+"]";
	}

}
