package edu.br.utfpr.builder.api;

import edu.br.utfpr.model.Token;

/**
 * @author: Pablo Fernandez
 */
public class SimpleGeoApi extends DefaultApi10a
{
  private static final String ENDPOINT = "these are not used since SimpleGeo uses 2 legged OAuth";

	@Override
	public String getRequestTokenEndpoint()
	{
		return ENDPOINT;
	}

	@Override
	public String getAccessTokenEndpoint()
	{
		return ENDPOINT;
	}

	@Override
	public String getAuthorizationUrl(Token requestToken)
	{
		return ENDPOINT;
	}
}
