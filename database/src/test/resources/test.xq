module namespace _ = '_';

import module namespace c = "http:myfuncs/common";
import module namespace i18n = "http:myfuncs/i18n";

declare %unit:test function _:find-localized-messages-test(){
    let $resources := i18n:find-localized-messages("ru")
    return unit:assert-equals(count($resources), 4)
};