class GrailsSpringSocialLinkedinGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [springSocialCore: '0.1.6']
    def loadAfter = ['springSocialCore']
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def author = "Carlos Andres Herrera Parra"
    def authorEmail = "caherrerapa@gmail.com, carlos@syndagma.com"
    def title = "Grails Spring Social Linked In Plugin"
    def description = '''\\
Based on the facebook, twitter plugin developed by synergyj .
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/grails-spring-social-linkedin"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

	def doWithSpring = {
        // TODO Implement runtime spring config (optional)
		xmlns context: "http://www.springframework.org/schema/context"
        context.'component-scan'('base-package': "grails.plugins.springsocial.config.linkedin")
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
