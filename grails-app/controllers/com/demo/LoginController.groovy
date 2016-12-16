package com.demo
import grails.converters.JSON
import uk.co.desirableobjects.oauth.scribe.OauthService
class LoginController {
    FloginService floginService
    OauthService oauthService
    def new1
    def index() {

    }
    def success(){
        String sessionKey = oauthService.findSessionKeyForAccessToken('facebook')
        def token = session[sessionKey]
//        String st  =  "Harish"
          def new1 =floginService.serviceMethod(token)
            println(new1+"Token")
        def data = JSON.parse(new1)
        String name = data.name
        String id = data.id
        def sendID = [name:name,id:id]
        [sendID:sendID]
    }
}
