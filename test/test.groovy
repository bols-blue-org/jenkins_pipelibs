package jp.lnc.jenkins.libs;
@Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')

import spock.lang.*

class MyFirstSpock extends Specification {

    // テストメソッド（フィーチャーメソッド）
    def "こんにちわSpock!"() {
        expect:
        1 > 0
    }

    // テストメソッド（フィーチャーメソッド）
    def "こんにちわSpock2!"() {
        expect:
        new Point().getInt() > 0
    }
}
