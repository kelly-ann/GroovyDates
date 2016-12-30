// create a new date
Date today = new Date()
println today
println "--------"

// format date
Date bday = new Date("1/25/2017")
println "An arbitrary date: $bday"
println "With formatting date: " + bday.format('MM-d-YY')
println "--------"

// add & subtract dates
Date oneWeekFromToday = today + 7
Date oneWeekAgo = today - 7
println "Today + 1 week = $oneWeekFromToday"
println "Today - 1 week = $oneWeekAgo"
println "--------"

// downto & upto
println "count down to today from 1 week ago: "
oneWeekFromToday.downto(today){
    println it
}
println "--------"

//
println "2 Weeks of days (i.e last week, today, and next week): "
Range twoWeeks = oneWeekAgo.. oneWeekFromToday
twoWeeks.each {
    println it
}
println '--------'

// next & previous days
Date newYear = new Date("1/1/2017")
println "newYear + 1 day: ${newYear + 1}"
println "newYear - 1 day: ${newYear - 1}"
println '--------'

Date rightNow = new Date()
def rightNowForDatabase = rightNow.toTimestamp()
println "Can insert into the DB: $rightNowForDatabase"

