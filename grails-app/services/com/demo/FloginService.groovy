package com.demo
import org.scribe.model.Token
import uk.co.desirableobjects.oauth.scribe.OauthService
import grails.transaction.Transactional

@Transactional
class FloginService {

    OauthService oauthService

    def serviceMethod(Token facebookAccessToken) {
            println(facebookAccessToken)
        def generatedToken = oauthService.getFacebookResource(facebookAccessToken, 'https://graph.facebook.com/v2.2/me').body
        return generatedToken
    }
}
