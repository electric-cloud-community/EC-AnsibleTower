import com.cloudbees.flowpdf.*

/**
* AnsibleTower
*/
class AnsibleTower extends FlowPlugin {

    @Override
    Map<String, Object> pluginInfo() {
        return [
                pluginName     : '@PLUGIN_KEY@',
                pluginVersion  : '@PLUGIN_VERSION@',
                configFields   : ['config'],
                configLocations: ['ec_plugin_cfgs'],
                defaultConfigValues: [:]
        ]
    }
// === check connection ends ===
/**
     * Auto-generated method for the procedure Launch a Job Template/Launch a Job Template
     * Add your code into this method and it will be called when step runs* Parameter: config* Parameter: id
     */
    def launchAJobTemplate(StepParameters p, StepResult sr) {
        LaunchAJobTemplateParameters sp = LaunchAJobTemplateParameters.initParameters(p)
        ECAnsibleTowerRESTClient rest = genECAnsibleTowerRESTClient()
        Map restParams = [:]
        Map requestParams = p.asMap
        restParams.put('id', requestParams.get('id'))

        Object response = rest.launchJobTemplate(restParams)
        log.info "Got response from server: $response"
        //TODO step result output parameters
        sr.setOutputParameter('result', response.toString())
        sr.setOutputParameter('id', response.id.toString())
        sr.apply()
    }
/**
     * This method returns REST Client object
     */
    ECAnsibleTowerRESTClient genECAnsibleTowerRESTClient() {
        Context context = getContext()
        ECAnsibleTowerRESTClient rest = ECAnsibleTowerRESTClient.fromConfig(context.getConfigValues(), this)
        return rest
    }
/**
     * Auto-generated method for the procedure List Job Templates/List Job Templates
     * Add your code into this method and it will be called when step runs* Parameter: config
     */
    def listJobTemplates(StepParameters p, StepResult sr) {
        ListJobTemplatesParameters sp = ListJobTemplatesParameters.initParameters(p)
        ECAnsibleTowerRESTClient rest = genECAnsibleTowerRESTClient()
        Map restParams = [:]
        Map requestParams = p.asMap

        Object response = rest.listJobTemplates(restParams)
        log.info "Got response from server: $response"
        //TODO step result output parameters
        sr.setOutputParameter('result', response.toString())
        sr.apply()
    }
/**
     * Auto-generated method for the procedure Retrieve a Job Template/Retrieve a Job Template
     * Add your code into this method and it will be called when step runs* Parameter: config* Parameter: id
     */
    def retrieveAJobTemplate(StepParameters p, StepResult sr) {
        RetrieveAJobTemplateParameters sp = RetrieveAJobTemplateParameters.initParameters(p)
        ECAnsibleTowerRESTClient rest = genECAnsibleTowerRESTClient()
        Map restParams = [:]
        Map requestParams = p.asMap
        restParams.put('id', requestParams.get('id'))

        Object response = rest.getJobTemplate(restParams)
        log.info "Got response from server: $response"
        //TODO step result output parameters
        sr.setOutputParameter('result', response.toString())
        sr.apply()
    }
/**
     * Auto-generated method for the procedure List Inventories/List Inventories
     * Add your code into this method and it will be called when step runs* Parameter: config
     */
    def listInventories(StepParameters p, StepResult sr) {
        ListInventoriesParameters sp = ListInventoriesParameters.initParameters(p)
        ECAnsibleTowerRESTClient rest = genECAnsibleTowerRESTClient()
        Map restParams = [:]
        Map requestParams = p.asMap

        Object response = rest.listInventories(restParams)
        log.info "Got response from server: $response"
        //TODO step result output parameters
        sr.setOutputParameter('result', response.toString())
        sr.apply()
    }
/**
     * Auto-generated method for the procedure Retrieve an Inventory/Retrieve an Inventory
     * Add your code into this method and it will be called when step runs* Parameter: config* Parameter: id
     */
    def retrieveAnInventory(StepParameters p, StepResult sr) {
        RetrieveAnInventoryParameters sp = RetrieveAnInventoryParameters.initParameters(p)
        ECAnsibleTowerRESTClient rest = genECAnsibleTowerRESTClient()
        Map restParams = [:]
        Map requestParams = p.asMap
        restParams.put('id', requestParams.get('id'))

        Object response = rest.getInventory(restParams)
        log.info "Got response from server: $response"
        //TODO step result output parameters
        sr.setOutputParameter('result', response.toString())
        sr.apply()
    }
// === step ends ===

}