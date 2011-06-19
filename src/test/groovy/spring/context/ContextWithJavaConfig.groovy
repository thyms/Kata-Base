package spring.context

import model.car.*
import spock.lang.Specification

/**
 * @author Deniz KALFA
 *
 */
class ContextWithJavaConfig  extends Specification {
	
	def "should generate objects"() {
		when:
		def applicationContext = null
		def car = null
		def engine = null
		
		then:
		car != null
		engine != null
		engine == car.getEngine()
	}
}
