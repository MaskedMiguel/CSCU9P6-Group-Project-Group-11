
// Generated by Together


/**
 * An interface to SAAMS:
 * Local Air Traffic Controller Screen:
 * Inputs events from LATC (a person), and displays aircraft information.
 * This class is a controller for the AircraftManagementDatabase: sending it messages to change the aircraft status information.
 * This class also registers as an observer of the AircraftManagementDatabase, and is notified whenever any change occurs in that <<model>> element.
 * See written documentation.
 * @stereotype boundary/view/controller
 * @url element://model:project::SAAMS/design:view:::id15rnfcko4qme4cko4swib
 * @url element://model:project::SAAMS/design:view:::id2fh3ncko4qme4cko4swe5
 * @url element://model:project::SAAMS/design:node:::id15rnfcko4qme4cko4swib.node107
 * @url element://model:project::SAAMS/design:view:::idwwyucko4qme4cko4sgxi
 */
public class LATC {
/**
  *  The Local Air Traffic Controller Screen interface has access to the AircraftManagementDatabase.
  * @supplierCardinality 1
  * @clientCardinality 1
  * @label accesses/observes
  * @directed*/
  private AircraftManagementDatabase lnkUnnamed;

}
