package lithium.federatedsearch.constant;

/**
 * Created by baban_sinha on 15/04/16.
 */
public interface FederatedSearchConstants {

	String SERCH_URL = "https://services.att.com/kmservices/v2/search?q=U-verse services&app-id=forums";

	//Retrieve a single KMS solution by Published ID
	String KMS_CONTENT_URL_BY_PUBLISHED_ID = "https://services-finalstage.att.com/kmservices/v2/contents/KM1009644?app-id=forums";

	//Top Solutions results are retrieved depending upon the setname and srvgrp (service group) tagsets.
	String KMS_TOP_SOLUTION_BY_TAGS_URL = "https://services.att.com/kmservices/v2/topsolutions?tags=Article&app-id=forums";

	//List of valid tags can be found by calling the tagset API
	String KMS_FETCH_ALL_TAGSETS_URL = "https://services.att.com/kmservices/v2/tagsets/content?app-id=forums";

	//Solution Group Call returns all the articles which are associated with a parent child relationship.
	//This service requires a parent id on which it performs a search to return the results along with the tags.

	String KMS_GROUP_SOLUTION_URL = "https://services.att.com/kmservices/v2/solutiongroups/KM1009644?app-id=forums";

	//This call can also be made to restrict the child articles depending upon the provided tags:
	String KMS_GROUP_SOLUTION_URL_WITH_TAG_FILTER =  "https://services.att.com/kmservices/v2/solutiongroups/KM1009644?app-id=forums&tags=topic-dtc";

	//An additional max-results parameter can also be passed.

	String KMS_TOPIC_LIST_URL = "https://services.att.com/kmservices/v2/tagsets/topic?app-id=forums";
	String KMS_TOPIC_LIST_BY_SYSTEM_TAG_NAME_URL = "https://services.att.com/kmservices/v2/tagsets/topic/topic_consumer?app-id=forums";

	//format=true : will return in tree format(default is true)
	//format=false : will return only list of topics
	String KMS_TOPIC_LIST_WITH_FORMAT_URL = "https://services.att.com/kmservices/v2/tagsets/topic?app-id=forums&format=false";
	String KMS_TOPIC_LIST_BY_SYSTEM_TAG_NAME_WITH_FORMAT_URL = "https://services.att.com/kmservices/v2/tagsets/topic/topic_consumer?app-id=forums";




}
