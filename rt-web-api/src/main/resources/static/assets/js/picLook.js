function  getPicUrl(){
    var T = {};
    /**
     * get multiple elements
     * @public
     */
    T.all = function(selector, contextElement) {
        var nodeList,
            list = [];
        if (contextElement) {
            nodeList = contextElement.querySelectorAll(selector);
        } else {
            nodeList = document.querySelectorAll(selector);
        }
        if (nodeList && nodeList.length > 0) {
            list = Array.prototype.slice.call(nodeList);
        }
        return list;
    }

    /**
     * delegate an event to a parent element
     * @public
     * @param  array     $el        parent element
     * @param  string    eventType  name of the event
     * @param  string    selector   target's selector
     * @param  function  fn
     */
    T.delegate = function($el, eventType, selector, fn) {
        if (!$el) { return; }
        $el.addEventListener(eventType, function(e) {
            var targets = T.all(selector, $el);
            if (!targets) {
                return;
            }
            // findTarget:
            for (var i=0; i<targets.length; i++) {
                var $node = e.target;
                while ($node) {
                    if ($node == targets[i]) {
                        fn.call($node, e);
                        break; //findTarget;
                    }
                    $node = $node.parentNode;
                    if ($node == $el) {
                        break;
                    }
                }
            }
        }, false);
    };

    var urls = [];
    var imgs = T.all('img',T.all('#imgBox')[0]);
    imgs.forEach(function(v,i){
        urls.push(v.src);
    })

    T.delegate(document.querySelector('#imgBox'), 'click','img',function(){
        var current = this.src;
        var obj = {
            urls : urls,
            current : current
        };
        previewImage.start(obj);
    });
}