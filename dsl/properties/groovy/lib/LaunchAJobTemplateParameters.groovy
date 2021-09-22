
// DO NOT EDIT THIS BLOCK BELOW=== Parameters starts ===
// PLEASE DO NOT EDIT THIS FILE

import com.cloudbees.flowpdf.StepParameters

class LaunchAJobTemplateParameters {
    /**
    * Label: Job Template id, type: entry
    */
    String id
    /**
    * Label: Job Template Parameters, type: textarea
    */
    String body

    static LaunchAJobTemplateParameters initParameters(StepParameters sp) {
        LaunchAJobTemplateParameters parameters = new LaunchAJobTemplateParameters()

        def id = sp.getRequiredParameter('id').value
        parameters.id = id
        def body = sp.getParameter('body').value
        parameters.body = body

        return parameters
    }
}
// DO NOT EDIT THIS BLOCK ABOVE ^^^=== Parameters ends, checksum: 1502e05c9be71276817df227126fa182 ===
