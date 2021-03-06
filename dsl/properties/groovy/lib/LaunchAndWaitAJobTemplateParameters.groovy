
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class LaunchAndWaitAJobTemplateParameters {
    /**
    * Label: Job Template id, type: entry
    */
    String id
    /**
    * Label: Job Template Parameters, type: textarea
    */
    String body
    /**
    * Label: Job Status polling interval, type: entry
    */
    String checkInterval
    /**
    * Label: Depend On Ansible Tower Job Result?, type: checkbox
    */
    boolean dependOnResult

    static LaunchAndWaitAJobTemplateParameters initParameters(StepParameters sp) {
        LaunchAndWaitAJobTemplateParameters parameters = new LaunchAndWaitAJobTemplateParameters()

        def id = sp.getRequiredParameter('id').value
        parameters.id = id
        def body = sp.getParameter('body').value
        parameters.body = body
        def checkInterval = sp.getParameter('checkInterval').value
        parameters.checkInterval = checkInterval
        def dependOnResult = sp.getParameter('dependOnResult').value == "true"
        parameters.dependOnResult = dependOnResult

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: 9ebd9d7b1ef70a077bc76547e1b24491 ===
